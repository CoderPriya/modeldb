// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.random.*;
import java.util.*;
import java.util.function.Function;

public class AutogenPythonRequirementEnvironmentDiff implements ProtoType {
  private AutogenPythonRequirementEnvironmentBlob A;
  private AutogenPythonRequirementEnvironmentBlob B;
  private AutogenPythonRequirementEnvironmentBlob C;
  private AutogenDiffStatusEnumDiffStatus Status;

  public AutogenPythonRequirementEnvironmentDiff() {
    this.A = null;
    this.B = null;
    this.C = null;
    this.Status = null;
  }

  public Boolean isEmpty() {
    if (this.A != null && !this.A.equals(null)) {
      return false;
    }
    if (this.B != null && !this.B.equals(null)) {
      return false;
    }
    if (this.C != null && !this.C.equals(null)) {
      return false;
    }
    if (this.Status != null && !this.Status.equals(null)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\"class\": \"AutogenPythonRequirementEnvironmentDiff\", \"fields\": {");
    boolean first = true;
    if (this.A != null && !this.A.equals(null)) {
      if (!first) sb.append(", ");
      sb.append("\"A\": " + A);
      first = false;
    }
    if (this.B != null && !this.B.equals(null)) {
      if (!first) sb.append(", ");
      sb.append("\"B\": " + B);
      first = false;
    }
    if (this.C != null && !this.C.equals(null)) {
      if (!first) sb.append(", ");
      sb.append("\"C\": " + C);
      first = false;
    }
    if (this.Status != null && !this.Status.equals(null)) {
      if (!first) sb.append(", ");
      sb.append("\"Status\": " + Status);
      first = false;
    }
    sb.append("}}");
    return sb.toString();
  }

  // TODO: actually hash
  public String getSHA() {
    StringBuilder sb = new StringBuilder();
    sb.append("AutogenPythonRequirementEnvironmentDiff");
    if (this.A != null && !this.A.equals(null)) {
      sb.append("::A::").append(A);
    }
    if (this.B != null && !this.B.equals(null)) {
      sb.append("::B::").append(B);
    }
    if (this.C != null && !this.C.equals(null)) {
      sb.append("::C::").append(C);
    }
    if (this.Status != null && !this.Status.equals(null)) {
      sb.append("::Status::").append(Status);
    }

    return sb.toString();
  }

  // TODO: not consider order on lists
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (!(o instanceof AutogenPythonRequirementEnvironmentDiff)) return false;
    AutogenPythonRequirementEnvironmentDiff other = (AutogenPythonRequirementEnvironmentDiff) o;

    {
      Function3<
              AutogenPythonRequirementEnvironmentBlob,
              AutogenPythonRequirementEnvironmentBlob,
              Boolean>
          f = (x, y) -> x.equals(y);
      if (this.A != null || other.A != null) {
        if (this.A == null && other.A != null) return false;
        if (this.A != null && other.A == null) return false;
        if (!f.apply(this.A, other.A)) return false;
      }
    }
    {
      Function3<
              AutogenPythonRequirementEnvironmentBlob,
              AutogenPythonRequirementEnvironmentBlob,
              Boolean>
          f = (x, y) -> x.equals(y);
      if (this.B != null || other.B != null) {
        if (this.B == null && other.B != null) return false;
        if (this.B != null && other.B == null) return false;
        if (!f.apply(this.B, other.B)) return false;
      }
    }
    {
      Function3<
              AutogenPythonRequirementEnvironmentBlob,
              AutogenPythonRequirementEnvironmentBlob,
              Boolean>
          f = (x, y) -> x.equals(y);
      if (this.C != null || other.C != null) {
        if (this.C == null && other.C != null) return false;
        if (this.C != null && other.C == null) return false;
        if (!f.apply(this.C, other.C)) return false;
      }
    }
    {
      Function3<AutogenDiffStatusEnumDiffStatus, AutogenDiffStatusEnumDiffStatus, Boolean> f =
          (x, y) -> x.equals(y);
      if (this.Status != null || other.Status != null) {
        if (this.Status == null && other.Status != null) return false;
        if (this.Status != null && other.Status == null) return false;
        if (!f.apply(this.Status, other.Status)) return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.A, this.B, this.C, this.Status);
  }

  public AutogenPythonRequirementEnvironmentDiff setA(
      AutogenPythonRequirementEnvironmentBlob value) {
    this.A = Utils.removeEmpty(value);
    return this;
  }

  public AutogenPythonRequirementEnvironmentBlob getA() {
    return this.A;
  }

  public AutogenPythonRequirementEnvironmentDiff setB(
      AutogenPythonRequirementEnvironmentBlob value) {
    this.B = Utils.removeEmpty(value);
    return this;
  }

  public AutogenPythonRequirementEnvironmentBlob getB() {
    return this.B;
  }

  public AutogenPythonRequirementEnvironmentDiff setC(
      AutogenPythonRequirementEnvironmentBlob value) {
    this.C = Utils.removeEmpty(value);
    return this;
  }

  public AutogenPythonRequirementEnvironmentBlob getC() {
    return this.C;
  }

  public AutogenPythonRequirementEnvironmentDiff setStatus(AutogenDiffStatusEnumDiffStatus value) {
    this.Status = Utils.removeEmpty(value);
    return this;
  }

  public AutogenDiffStatusEnumDiffStatus getStatus() {
    return this.Status;
  }

  public static AutogenPythonRequirementEnvironmentDiff fromProto(
      ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff blob) {
    if (blob == null) {
      return null;
    }

    AutogenPythonRequirementEnvironmentDiff obj = new AutogenPythonRequirementEnvironmentDiff();
    {
      Function<
              ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,
              AutogenPythonRequirementEnvironmentBlob>
          f = x -> AutogenPythonRequirementEnvironmentBlob.fromProto(blob.getA());
      obj.setA(f.apply(blob));
    }
    {
      Function<
              ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,
              AutogenPythonRequirementEnvironmentBlob>
          f = x -> AutogenPythonRequirementEnvironmentBlob.fromProto(blob.getB());
      obj.setB(f.apply(blob));
    }
    {
      Function<
              ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,
              AutogenPythonRequirementEnvironmentBlob>
          f = x -> AutogenPythonRequirementEnvironmentBlob.fromProto(blob.getC());
      obj.setC(f.apply(blob));
    }
    {
      Function<
              ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,
              AutogenDiffStatusEnumDiffStatus>
          f = x -> AutogenDiffStatusEnumDiffStatus.fromProto(blob.getStatus());
      obj.setStatus(f.apply(blob));
    }
    return obj;
  }

  public ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder toProto() {
    ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder builder =
        ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.newBuilder();
    {
      if (this.A != null && !this.A.equals(null)) {
        Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder, Void> f =
            x -> {
              builder.setA(this.A.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.B != null && !this.B.equals(null)) {
        Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder, Void> f =
            x -> {
              builder.setB(this.B.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.C != null && !this.C.equals(null)) {
        Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder, Void> f =
            x -> {
              builder.setC(this.C.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Status != null && !this.Status.equals(null)) {
        Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder, Void> f =
            x -> {
              builder.setStatus(this.Status.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    return builder;
  }

  public void preVisitShallow(Visitor visitor) throws ModelDBException {
    visitor.preVisitAutogenPythonRequirementEnvironmentDiff(this);
  }

  public void preVisitDeep(Visitor visitor) throws ModelDBException {
    this.preVisitShallow(visitor);
    visitor.preVisitDeepAutogenPythonRequirementEnvironmentBlob(this.A);
    visitor.preVisitDeepAutogenPythonRequirementEnvironmentBlob(this.B);
    visitor.preVisitDeepAutogenPythonRequirementEnvironmentBlob(this.C);
    visitor.preVisitDeepAutogenDiffStatusEnumDiffStatus(this.Status);
  }

  public AutogenPythonRequirementEnvironmentDiff postVisitShallow(Visitor visitor)
      throws ModelDBException {
    return visitor.postVisitAutogenPythonRequirementEnvironmentDiff(this);
  }

  public AutogenPythonRequirementEnvironmentDiff postVisitDeep(Visitor visitor)
      throws ModelDBException {
    this.setA(visitor.postVisitDeepAutogenPythonRequirementEnvironmentBlob(this.A));
    this.setB(visitor.postVisitDeepAutogenPythonRequirementEnvironmentBlob(this.B));
    this.setC(visitor.postVisitDeepAutogenPythonRequirementEnvironmentBlob(this.C));
    this.setStatus(visitor.postVisitDeepAutogenDiffStatusEnumDiffStatus(this.Status));
    return this.postVisitShallow(visitor);
  }
}
