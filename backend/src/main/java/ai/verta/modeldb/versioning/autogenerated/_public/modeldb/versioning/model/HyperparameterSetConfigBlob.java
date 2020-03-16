// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.diff.ProtoType;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;

public class HyperparameterSetConfigBlob implements ProtoType {
    public String Name;
    public ContinuousHyperparameterSetConfigBlob Continuous;
    public DiscreteHyperparameterSetConfigBlob Discrete;

    public HyperparameterSetConfigBlob() {
        this.Name = null;
        this.Continuous = null;
        this.Discrete = null;
    }

    public Boolean isEmpty() {
        if (this.Name != null) {
            return false;
        }
        if (this.Continuous != null) {
            return false;
        }
        if (this.Discrete != null) {
            return false;
        }
        return true;
    }

    public Boolean equals(HyperparameterSetConfigBlob other) {
        if (other == null) {
            return false;
        }
        {
            Function3<String,String,Boolean> f = (x, y) -> x.equals(y);
            if (this.Name == null && other.Name == null)
                return true;
            if (this.Name == null && other.Name != null)
                return false;
            if (this.Name != null && other.Name == null)
                return false;
            if (!f.apply(this.Name, other.Name))
                return false;
        }
        {
            Function3<ContinuousHyperparameterSetConfigBlob,ContinuousHyperparameterSetConfigBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.Continuous == null && other.Continuous == null)
                return true;
            if (this.Continuous == null && other.Continuous != null)
                return false;
            if (this.Continuous != null && other.Continuous == null)
                return false;
            if (!f.apply(this.Continuous, other.Continuous))
                return false;
        }
        {
            Function3<DiscreteHyperparameterSetConfigBlob,DiscreteHyperparameterSetConfigBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.Discrete == null && other.Discrete == null)
                return true;
            if (this.Discrete == null && other.Discrete != null)
                return false;
            if (this.Discrete != null && other.Discrete == null)
                return false;
            if (!f.apply(this.Discrete, other.Discrete))
                return false;
        }
        return true;
    }

    public HyperparameterSetConfigBlob setName(String value) {
        this.Name = value;
        return this;
    }
    public HyperparameterSetConfigBlob setContinuous(ContinuousHyperparameterSetConfigBlob value) {
        this.Continuous = value;
        return this;
    }
    public HyperparameterSetConfigBlob setDiscrete(DiscreteHyperparameterSetConfigBlob value) {
        this.Discrete = value;
        return this;
    }

    static public HyperparameterSetConfigBlob fromProto(ai.verta.modeldb.versioning.HyperparameterSetConfigBlob blob) {
        if (blob == null) {
            return null;
        }

        HyperparameterSetConfigBlob obj = new HyperparameterSetConfigBlob();
        {
            Function<ai.verta.modeldb.versioning.HyperparameterSetConfigBlob,String> f = x -> (blob.getName());
            obj.Name = f.apply(blob);
        }
        {
            Function<ai.verta.modeldb.versioning.HyperparameterSetConfigBlob,ContinuousHyperparameterSetConfigBlob> f = x -> ContinuousHyperparameterSetConfigBlob.fromProto(blob.getContinuous());
            obj.Continuous = f.apply(blob);
        }
        {
            Function<ai.verta.modeldb.versioning.HyperparameterSetConfigBlob,DiscreteHyperparameterSetConfigBlob> f = x -> DiscreteHyperparameterSetConfigBlob.fromProto(blob.getDiscrete());
            obj.Discrete = f.apply(blob);
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.HyperparameterSetConfigBlob.Builder toProto() {
        ai.verta.modeldb.versioning.HyperparameterSetConfigBlob.Builder builder = ai.verta.modeldb.versioning.HyperparameterSetConfigBlob.newBuilder();
        {
            if (this.Name != null) {
                Function<ai.verta.modeldb.versioning.HyperparameterSetConfigBlob.Builder,Void> f = x -> { builder.setName(this.Name); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.Continuous != null) {
                Function<ai.verta.modeldb.versioning.HyperparameterSetConfigBlob.Builder,Void> f = x -> { builder.setContinuous(this.Continuous.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.Discrete != null) {
                Function<ai.verta.modeldb.versioning.HyperparameterSetConfigBlob.Builder,Void> f = x -> { builder.setDiscrete(this.Discrete.toProto()); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitHyperparameterSetConfigBlob(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepString(this.Name);
        visitor.preVisitDeepContinuousHyperparameterSetConfigBlob(this.Continuous);
        visitor.preVisitDeepDiscreteHyperparameterSetConfigBlob(this.Discrete);
    }

    public HyperparameterSetConfigBlob postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitHyperparameterSetConfigBlob(this);
    }

    public HyperparameterSetConfigBlob postVisitDeep(Visitor visitor) throws ModelDBException {
        this.Name = visitor.postVisitDeepString(this.Name);
        this.Continuous = visitor.postVisitDeepContinuousHyperparameterSetConfigBlob(this.Continuous);
        this.Discrete = visitor.postVisitDeepDiscreteHyperparameterSetConfigBlob(this.Discrete);
        return this.postVisitShallow(visitor);
    }
}