#!/bin/bash

set -e

BASE="../protos/gen/swagger/protos/public/modeldb/versioning/VersioningService.swagger.json"
TARGET="src/main/java/ai/verta/modeldb/versioning/autogenerated"

rm -rf $TARGET

for f in $(find $BASE -type f | sort)
do
    echo "Processing $f"
    ../client/tools/swagger_codegen.py --input $f --output-dir $TARGET --templates templates --file-suffix java --case capital --model model.java
    ../client/tools/swagger_codegen.py --input $f --output-dir $TARGET --templates templates --file-suffix Gen.java --case capital --model gen.java

    echo ""
done

for f in $(find $TARGET -type f | grep -v 'Blob\(Gen\)\?.java' | grep -v 'Diff\(Gen\)\?.java')
do
    rm $f
done

for f in $(find $TARGET -type f)
do
    (cat $f | sed 's,Versioning,,g') > /tmp/foo
    rm $f
    mv /tmp/foo $(dirname $f)/$(basename $f | sed 's,^Versioning,,')
done

cat > $TARGET/_public/modeldb/versioning/model/DiffStatusEnumDiffStatus.java <<EOF
// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.ProtoType;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import ai.verta.modeldb.versioning.DiffStatusEnum.DiffStatus;

public class DiffStatusEnumDiffStatus implements ProtoType {
    public DiffStatusEnum.DiffStatus Status;

    public DiffStatusEnumDiffStatus() {
        Status = DiffStatus.UNKNOWN;
    }

    public DiffStatusEnumDiffStatus(DiffStatusEnum.DiffStatus s) {
        Status = s;
    }

    public Boolean isEmpty() {
        return Status == DiffStatus.UNKNOWN;
    }

    public Boolean isDeleted() {
        return Status == DiffStatus.UNKNOWN || Status == DiffStatus.DELETED;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof DiffStatusEnumDiffStatus)) return false;
        DiffStatusEnumDiffStatus other = (DiffStatusEnumDiffStatus) o;
        return Status == other.Status;
    }

    static public DiffStatusEnumDiffStatus fromProto(ai.verta.modeldb.versioning.DiffStatusEnum.DiffStatus blob) {
        if (blob == null) {
            return null;
        }

        DiffStatusEnumDiffStatus obj = new DiffStatusEnumDiffStatus();
        obj.Status = blob;
        return obj;
    }

    public ai.verta.modeldb.versioning.DiffStatusEnum.DiffStatus toProto() {
        return this.Status;
    }

    @Override
    public String toString() {
        return Status.toString();
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitDiffStatusEnumDiffStatus(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
    }

    public DiffStatusEnumDiffStatus postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitDiffStatusEnumDiffStatus(this);
    }

    public DiffStatusEnumDiffStatus postVisitDeep(Visitor visitor) throws ModelDBException {
        return this.postVisitShallow(visitor);
    }
}
EOF

cat > $TARGET/_public/modeldb/versioning/model/DiffStatusEnumDiffStatusGen.java <<EOF
// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.generator.java.util.*;
import com.pholser.junit.quickcheck.random.*;

public class DiffStatusEnumDiffStatusGen extends Generator<DiffStatusEnumDiffStatus> {
    public DiffStatusEnumDiffStatusGen() {
        super(DiffStatusEnumDiffStatus.class);
    }

    @Override public DiffStatusEnumDiffStatus generate(
            SourceOfRandomness r,
            GenerationStatus status) {
                return new DiffStatusEnumDiffStatus(r.choose(new DiffStatusEnum.DiffStatus[]{DiffStatusEnum.DiffStatus.ADDED, DiffStatusEnum.DiffStatus.DELETED, DiffStatusEnum.DiffStatus.MODIFIED}));
    }
}
EOF

VISITOR="src/main/java/ai/verta/modeldb/versioning/blob/visitors/Visitor.java"

cat > $VISITOR <<EOF
package ai.verta.modeldb.versioning.blob.visitors;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model.*;
import ai.verta.modeldb.versioning.blob.diff.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Visitor {
EOF
for f in $(find $TARGET -type f | grep '\(Blob\|Diff\).java$' | sort)
do
    type=$(basename $f | sed 's,\.java$,,')
    cat >> $VISITOR <<EOF
    public void preVisitListOf${type}(List<${type}> lst) throws ModelDBException {
        if (lst == null) return;
        for (${type} val : lst) {
            preVisit${type}(val);
        }
    }

    public void preVisitDeepListOf${type}(List<${type}> lst) throws ModelDBException {
        if (lst == null) return;
        for (${type} val : lst) {
            preVisitDeep${type}(val);
        }
    }

    public List<${type}> postVisitListOf${type}(List<${type}> lst) throws ModelDBException {
        if (lst == null) return null;
        final List<${type}> collect = new ArrayList<>(lst.size());
        for (${type} val : lst) {
            collect.add(postVisit${type}(val));
        }
        return collect;
    }

    public List<${type}> postVisitDeepListOf${type}(List<${type}> lst) throws ModelDBException {
        if (lst == null) return null;
        final List<${type}> collect = new ArrayList<>(lst.size());
        for (${type} val : lst) {
            collect.add(postVisitDeep${type}(val));
        }
        return collect;
    }

    public void preVisit${type}(${type} blob) throws ModelDBException {}
    public void preVisitDeep${type}(${type} blob) throws ModelDBException {}
    public ${type} postVisit${type}(${type} blob) throws ModelDBException { return blob; }
    public ${type} postVisitDeep${type}(${type} blob) throws ModelDBException { if (blob != null) return blob.postVisitDeep(this); return null; }
EOF
done
for type in String Boolean Double Integer Long Float DiffStatusEnumDiffStatus
do
    cat >> $VISITOR <<EOF
    public void preVisitListOf${type}(List<${type}> lst) throws ModelDBException {
        if (lst == null) return;
        for (${type} val : lst) {
            preVisit${type}(val);
        }
    }

    public void preVisitDeepListOf${type}(List<${type}> lst) throws ModelDBException {
        if (lst == null) return;
        for (${type} val : lst) {
            preVisitDeep${type}(val);
        }
    }

    public List<${type}> postVisitListOf${type}(List<${type}> lst) throws ModelDBException {
        if (lst == null) return null;
        final List<${type}> collect = new ArrayList<>(lst.size());
        for (${type} val : lst) {
            collect.add(postVisit${type}(val));
        }
        return collect;
    }

    public List<${type}> postVisitDeepListOf${type}(List<${type}> lst) throws ModelDBException {
        if (lst == null) return null;
        final List<${type}> collect = new ArrayList<>(lst.size());
        for (${type} val : lst) {
            collect.add(postVisitDeep${type}(val));
        }
        return collect;
    }

    public void preVisit${type}(${type} blob) throws ModelDBException {}
    public void preVisitDeep${type}(${type} blob) throws ModelDBException {}
    public ${type} postVisit${type}(${type} blob) throws ModelDBException { return blob; }
    public ${type} postVisitDeep${type}(${type} blob) throws ModelDBException { return blob; }
EOF
done
cat >> $VISITOR <<EOF
    public <T> T genericPostVisitDeep(T b) throws ModelDBException {
EOF
for f in $(find $TARGET -type f | grep '\(Blob\|Diff\).java$' | sort)
do
    type=$(basename $f | sed 's,\.java$,,')
    cat >> $VISITOR <<EOF
        if (b instanceof ${type}) {
            return Utils.removeEmpty((T) postVisitDeep${type}((${type}) b));
        }
EOF
done
cat >> $VISITOR <<EOF
        return Utils.removeEmpty(b);
    }
}
EOF

TEST_FILE="src/test/java/ai/verta/modeldb/blobs/BlobEquality.java"
cat > $TEST_FILE <<EOF
package ai.verta.modeldb.blobs;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model.*;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.generator.Fields;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.junit.Assume.*;

@RunWith(JUnitQuickcheck.class)
public class BlobEquality {
EOF
for f in $(find $TARGET -type f | grep '\(Blob\|Diff\).java$' | sort)
do
    type=$(basename $f | sed 's,\.java$,,')
    cat >> $TEST_FILE <<EOF
    @Property public void equality(${type} b) {
        assertTrue(b.equals(b));
    }

EOF
done
cat >> $TEST_FILE <<EOF
}
EOF

TEST_FILE="src/test/java/ai/verta/modeldb/blobs/BlobProtoEquality.java"
cat > $TEST_FILE <<EOF
package ai.verta.modeldb.blobs;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model.*;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.generator.Fields;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import java.util.regex.Pattern;

import static ai.verta.modeldb.blobs.Utils.enforceOneof;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

@RunWith(JUnitQuickcheck.class)
public class BlobProtoEquality {
EOF
for f in $(find $TARGET -type f | grep '\(Blob\|Diff\).java$' | sort)
do
    type=$(basename $f | sed 's,\.java$,,')
    cat >> $TEST_FILE <<EOF
    @Property public void protoEquality(${type} b) throws ModelDBException {
        ${type} newb = enforceOneof(b);
        ${type} other = newb == null ? null : ${type}.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

EOF
done
cat >> $TEST_FILE <<EOF
}
EOF

TEST_FILE="src/test/java/ai/verta/modeldb/blobs/DiffAndMerge.java"
cat > $TEST_FILE <<EOF
/*
package ai.verta.modeldb.blobs;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.generator.Fields;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import java.util.regex.Pattern;

import static ai.verta.modeldb.blobs.Utils.enforceOneof;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

@RunWith(JUnitQuickcheck.class)
public class DiffAndMerge {
    @Property public void diffAndMerge(Blob a, Blob b) throws ModelDBException {
        Blob newA = enforceOneof(a);
        Blob newB = enforceOneof(b);
        BlobDiff d = DiffComputer.computeBlobDiff(newA, newB);
        Blob diffedB = DiffMerger.mergeBlob(newA, d);
        assertEquals(newB, diffedB);
    }

EOF
for f in $(find $TARGET -type f | grep '\(Blob\).java$' | sed 's,Blob,,' | sort)
do
    type=$(basename $f | sed 's,\.java$,,')
    if [ "${type}" = "HyperparameterValuesConfig" ]
    then
        continue
    fi
    if [ "${type}" = "DiscreteHyperparameterSetConfig" ]
    then
        continue
    fi
    if [ "${type}" = "ContinuousHyperparameterSetConfig" ]
    then
        continue
    fi
    if [ "${type}" = "" ]
    then
        continue
    fi
    cat >> $TEST_FILE <<EOF
    @Property public void diffAndMerge${type}(${type}Blob a, ${type}Blob b) throws ModelDBException {
        System.out.println("");
        ${type}Blob newA = Utils.sortLists(enforceOneof(a));
        ${type}Blob newB = Utils.sortLists(enforceOneof(b));
        System.out.println(newA);
        System.out.println(newB);
        ${type}Diff d = DiffComputer.compute${type}Diff(newA, newB);
        System.out.println(d);
        ${type}Blob diffedB = Utils.sortLists(DiffMerger.merge${type}(newA, d));
        System.out.println(diffedB);
        assertEquals(newB, diffedB);
    }

EOF
done
cat >> $TEST_FILE <<EOF
}
*/
EOF