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
import com.pholser.junit.quickcheck.random.*;

public class PythonRequirementEnvironmentDiff implements ProtoType {
    public DiffStatusEnumDiffStatus Status;
    public PythonRequirementEnvironmentBlob A;
    public PythonRequirementEnvironmentBlob B;

    public PythonRequirementEnvironmentDiff() {
        this.Status = null;
        this.A = null;
        this.B = null;
    }

    public Boolean isEmpty() {
        if (this.Status != null && !this.Status.equals(null) ) {
            return false;
        }
        if (this.A != null && !this.A.equals(null) ) {
            return false;
        }
        if (this.B != null && !this.B.equals(null) ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "{\"class\": \"PythonRequirementEnvironmentDiff\",\"fields\": {" +
                "\"Status\": " + Status + ", " +
                "\"A\": " + A + ", " +
                "\"B\": " + B + 
                "}}";
    }

    // TODO: not consider order on lists
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof PythonRequirementEnvironmentDiff)) return false;
        PythonRequirementEnvironmentDiff other = (PythonRequirementEnvironmentDiff) o;

        {
            Function3<DiffStatusEnumDiffStatus,DiffStatusEnumDiffStatus,Boolean> f = (x, y) -> x.equals(y);
            if (this.Status != null || other.Status != null) {
                if (this.Status == null && other.Status != null)
                    return false;
                if (this.Status != null && other.Status == null)
                    return false;
                if (!f.apply(this.Status, other.Status))
                    return false;
            }
        }
        {
            Function3<PythonRequirementEnvironmentBlob,PythonRequirementEnvironmentBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.A != null || other.A != null) {
                if (this.A == null && other.A != null)
                    return false;
                if (this.A != null && other.A == null)
                    return false;
                if (!f.apply(this.A, other.A))
                    return false;
            }
        }
        {
            Function3<PythonRequirementEnvironmentBlob,PythonRequirementEnvironmentBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.B != null || other.B != null) {
                if (this.B == null && other.B != null)
                    return false;
                if (this.B != null && other.B == null)
                    return false;
                if (!f.apply(this.B, other.B))
                    return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        this.Status,
        this.A,
        this.B
        );
      }

    public PythonRequirementEnvironmentDiff setStatus(DiffStatusEnumDiffStatus value) {
        this.Status = Utils.removeEmpty(value);
        return this;
    }
    public PythonRequirementEnvironmentDiff setA(PythonRequirementEnvironmentBlob value) {
        this.A = Utils.removeEmpty(value);
        return this;
    }
    public PythonRequirementEnvironmentDiff setB(PythonRequirementEnvironmentBlob value) {
        this.B = Utils.removeEmpty(value);
        return this;
    }

    static public PythonRequirementEnvironmentDiff fromProto(ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff blob) {
        if (blob == null) {
            return null;
        }

        PythonRequirementEnvironmentDiff obj = new PythonRequirementEnvironmentDiff();
        {
            Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,DiffStatusEnumDiffStatus> f = x -> DiffStatusEnumDiffStatus.fromProto(blob.getStatus());
            obj.Status = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,PythonRequirementEnvironmentBlob> f = x -> PythonRequirementEnvironmentBlob.fromProto(blob.getA());
            obj.A = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,PythonRequirementEnvironmentBlob> f = x -> PythonRequirementEnvironmentBlob.fromProto(blob.getB());
            obj.B = Utils.removeEmpty(f.apply(blob));
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder toProto() {
        ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder builder = ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.newBuilder();
        {
            if (this.Status != null && !this.Status.equals(null) ) {
                Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder,Void> f = x -> { builder.setStatus(this.Status.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.A != null && !this.A.equals(null) ) {
                Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder,Void> f = x -> { builder.setA(this.A.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.B != null && !this.B.equals(null) ) {
                Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder,Void> f = x -> { builder.setB(this.B.toProto()); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitPythonRequirementEnvironmentDiff(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepDiffStatusEnumDiffStatus(this.Status);
        visitor.preVisitDeepPythonRequirementEnvironmentBlob(this.A);
        visitor.preVisitDeepPythonRequirementEnvironmentBlob(this.B);
    }

    public PythonRequirementEnvironmentDiff postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitPythonRequirementEnvironmentDiff(this);
    }

    public PythonRequirementEnvironmentDiff postVisitDeep(Visitor visitor) throws ModelDBException {
        this.setStatus(visitor.postVisitDeepDiffStatusEnumDiffStatus(this.Status));
        this.setA(visitor.postVisitDeepPythonRequirementEnvironmentBlob(this.A));
        this.setB(visitor.postVisitDeepPythonRequirementEnvironmentBlob(this.B));
        return this.postVisitShallow(visitor);
    }
}
