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

public class PathDatasetComponentDiff implements ProtoType {
    public DiffStatusEnumDiffStatus Status;
    public PathDatasetComponentBlob A;
    public PathDatasetComponentBlob B;

    public PathDatasetComponentDiff() {
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
        return "{\"class\": \"PathDatasetComponentDiff\",\"fields\": {" +
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
        if (!(o instanceof PathDatasetComponentDiff)) return false;
        PathDatasetComponentDiff other = (PathDatasetComponentDiff) o;

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
            Function3<PathDatasetComponentBlob,PathDatasetComponentBlob,Boolean> f = (x, y) -> x.equals(y);
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
            Function3<PathDatasetComponentBlob,PathDatasetComponentBlob,Boolean> f = (x, y) -> x.equals(y);
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

    public PathDatasetComponentDiff setStatus(DiffStatusEnumDiffStatus value) {
        this.Status = Utils.removeEmpty(value);
        return this;
    }
    public PathDatasetComponentDiff setA(PathDatasetComponentBlob value) {
        this.A = Utils.removeEmpty(value);
        return this;
    }
    public PathDatasetComponentDiff setB(PathDatasetComponentBlob value) {
        this.B = Utils.removeEmpty(value);
        return this;
    }

    static public PathDatasetComponentDiff fromProto(ai.verta.modeldb.versioning.PathDatasetComponentDiff blob) {
        if (blob == null) {
            return null;
        }

        PathDatasetComponentDiff obj = new PathDatasetComponentDiff();
        {
            Function<ai.verta.modeldb.versioning.PathDatasetComponentDiff,DiffStatusEnumDiffStatus> f = x -> DiffStatusEnumDiffStatus.fromProto(blob.getStatus());
            obj.Status = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.PathDatasetComponentDiff,PathDatasetComponentBlob> f = x -> PathDatasetComponentBlob.fromProto(blob.getA());
            obj.A = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.PathDatasetComponentDiff,PathDatasetComponentBlob> f = x -> PathDatasetComponentBlob.fromProto(blob.getB());
            obj.B = Utils.removeEmpty(f.apply(blob));
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.PathDatasetComponentDiff.Builder toProto() {
        ai.verta.modeldb.versioning.PathDatasetComponentDiff.Builder builder = ai.verta.modeldb.versioning.PathDatasetComponentDiff.newBuilder();
        {
            if (this.Status != null && !this.Status.equals(null) ) {
                Function<ai.verta.modeldb.versioning.PathDatasetComponentDiff.Builder,Void> f = x -> { builder.setStatus(this.Status.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.A != null && !this.A.equals(null) ) {
                Function<ai.verta.modeldb.versioning.PathDatasetComponentDiff.Builder,Void> f = x -> { builder.setA(this.A.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.B != null && !this.B.equals(null) ) {
                Function<ai.verta.modeldb.versioning.PathDatasetComponentDiff.Builder,Void> f = x -> { builder.setB(this.B.toProto()); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitPathDatasetComponentDiff(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepDiffStatusEnumDiffStatus(this.Status);
        visitor.preVisitDeepPathDatasetComponentBlob(this.A);
        visitor.preVisitDeepPathDatasetComponentBlob(this.B);
    }

    public PathDatasetComponentDiff postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitPathDatasetComponentDiff(this);
    }

    public PathDatasetComponentDiff postVisitDeep(Visitor visitor) throws ModelDBException {
        this.setStatus(visitor.postVisitDeepDiffStatusEnumDiffStatus(this.Status));
        this.setA(visitor.postVisitDeepPathDatasetComponentBlob(this.A));
        this.setB(visitor.postVisitDeepPathDatasetComponentBlob(this.B));
        return this.postVisitShallow(visitor);
    }
}
