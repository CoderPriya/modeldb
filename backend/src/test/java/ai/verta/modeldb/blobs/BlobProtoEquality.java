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
    @Property public void protoEquality(Blob b) throws ModelDBException {
        Blob newb = enforceOneof(b);
        Blob other = Blob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(BlobDiff b) throws ModelDBException {
        BlobDiff newb = enforceOneof(b);
        BlobDiff other = BlobDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(CodeBlob b) throws ModelDBException {
        CodeBlob newb = enforceOneof(b);
        CodeBlob other = CodeBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(CodeDiff b) throws ModelDBException {
        CodeDiff newb = enforceOneof(b);
        CodeDiff other = CodeDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(CommandLineEnvironmentDiff b) throws ModelDBException {
        CommandLineEnvironmentDiff newb = enforceOneof(b);
        CommandLineEnvironmentDiff other = CommandLineEnvironmentDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(ConfigBlob b) throws ModelDBException {
        ConfigBlob newb = enforceOneof(b);
        ConfigBlob other = ConfigBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(ConfigDiff b) throws ModelDBException {
        ConfigDiff newb = enforceOneof(b);
        ConfigDiff other = ConfigDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(ContinuousHyperparameterSetConfigBlob b) throws ModelDBException {
        ContinuousHyperparameterSetConfigBlob newb = enforceOneof(b);
        ContinuousHyperparameterSetConfigBlob other = ContinuousHyperparameterSetConfigBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(DatasetBlob b) throws ModelDBException {
        DatasetBlob newb = enforceOneof(b);
        DatasetBlob other = DatasetBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(DatasetDiff b) throws ModelDBException {
        DatasetDiff newb = enforceOneof(b);
        DatasetDiff other = DatasetDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(DiscreteHyperparameterSetConfigBlob b) throws ModelDBException {
        DiscreteHyperparameterSetConfigBlob newb = enforceOneof(b);
        DiscreteHyperparameterSetConfigBlob other = DiscreteHyperparameterSetConfigBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(DockerEnvironmentBlob b) throws ModelDBException {
        DockerEnvironmentBlob newb = enforceOneof(b);
        DockerEnvironmentBlob other = DockerEnvironmentBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(DockerEnvironmentDiff b) throws ModelDBException {
        DockerEnvironmentDiff newb = enforceOneof(b);
        DockerEnvironmentDiff other = DockerEnvironmentDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(EnvironmentBlob b) throws ModelDBException {
        EnvironmentBlob newb = enforceOneof(b);
        EnvironmentBlob other = EnvironmentBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(EnvironmentDiff b) throws ModelDBException {
        EnvironmentDiff newb = enforceOneof(b);
        EnvironmentDiff other = EnvironmentDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(EnvironmentVariablesBlob b) throws ModelDBException {
        EnvironmentVariablesBlob newb = enforceOneof(b);
        EnvironmentVariablesBlob other = EnvironmentVariablesBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(EnvironmentVariablesDiff b) throws ModelDBException {
        EnvironmentVariablesDiff newb = enforceOneof(b);
        EnvironmentVariablesDiff other = EnvironmentVariablesDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(GitCodeBlob b) throws ModelDBException {
        GitCodeBlob newb = enforceOneof(b);
        GitCodeBlob other = GitCodeBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(GitCodeDiff b) throws ModelDBException {
        GitCodeDiff newb = enforceOneof(b);
        GitCodeDiff other = GitCodeDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(HyperparameterConfigBlob b) throws ModelDBException {
        HyperparameterConfigBlob newb = enforceOneof(b);
        HyperparameterConfigBlob other = HyperparameterConfigBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(HyperparameterConfigDiff b) throws ModelDBException {
        HyperparameterConfigDiff newb = enforceOneof(b);
        HyperparameterConfigDiff other = HyperparameterConfigDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(HyperparameterSetConfigBlob b) throws ModelDBException {
        HyperparameterSetConfigBlob newb = enforceOneof(b);
        HyperparameterSetConfigBlob other = HyperparameterSetConfigBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(HyperparameterSetConfigDiff b) throws ModelDBException {
        HyperparameterSetConfigDiff newb = enforceOneof(b);
        HyperparameterSetConfigDiff other = HyperparameterSetConfigDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(HyperparameterValuesConfigBlob b) throws ModelDBException {
        HyperparameterValuesConfigBlob newb = enforceOneof(b);
        HyperparameterValuesConfigBlob other = HyperparameterValuesConfigBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(NotebookCodeBlob b) throws ModelDBException {
        NotebookCodeBlob newb = enforceOneof(b);
        NotebookCodeBlob other = NotebookCodeBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(NotebookCodeDiff b) throws ModelDBException {
        NotebookCodeDiff newb = enforceOneof(b);
        NotebookCodeDiff other = NotebookCodeDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(PathDatasetBlob b) throws ModelDBException {
        PathDatasetBlob newb = enforceOneof(b);
        PathDatasetBlob other = PathDatasetBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(PathDatasetComponentBlob b) throws ModelDBException {
        PathDatasetComponentBlob newb = enforceOneof(b);
        PathDatasetComponentBlob other = PathDatasetComponentBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(PathDatasetComponentDiff b) throws ModelDBException {
        PathDatasetComponentDiff newb = enforceOneof(b);
        PathDatasetComponentDiff other = PathDatasetComponentDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(PathDatasetDiff b) throws ModelDBException {
        PathDatasetDiff newb = enforceOneof(b);
        PathDatasetDiff other = PathDatasetDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(PythonEnvironmentBlob b) throws ModelDBException {
        PythonEnvironmentBlob newb = enforceOneof(b);
        PythonEnvironmentBlob other = PythonEnvironmentBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(PythonEnvironmentDiff b) throws ModelDBException {
        PythonEnvironmentDiff newb = enforceOneof(b);
        PythonEnvironmentDiff other = PythonEnvironmentDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(PythonRequirementEnvironmentBlob b) throws ModelDBException {
        PythonRequirementEnvironmentBlob newb = enforceOneof(b);
        PythonRequirementEnvironmentBlob other = PythonRequirementEnvironmentBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(PythonRequirementEnvironmentDiff b) throws ModelDBException {
        PythonRequirementEnvironmentDiff newb = enforceOneof(b);
        PythonRequirementEnvironmentDiff other = PythonRequirementEnvironmentDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(S3DatasetBlob b) throws ModelDBException {
        S3DatasetBlob newb = enforceOneof(b);
        S3DatasetBlob other = S3DatasetBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(S3DatasetComponentBlob b) throws ModelDBException {
        S3DatasetComponentBlob newb = enforceOneof(b);
        S3DatasetComponentBlob other = S3DatasetComponentBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(S3DatasetComponentDiff b) throws ModelDBException {
        S3DatasetComponentDiff newb = enforceOneof(b);
        S3DatasetComponentDiff other = S3DatasetComponentDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(S3DatasetDiff b) throws ModelDBException {
        S3DatasetDiff newb = enforceOneof(b);
        S3DatasetDiff other = S3DatasetDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(VersionEnvironmentBlob b) throws ModelDBException {
        VersionEnvironmentBlob newb = enforceOneof(b);
        VersionEnvironmentBlob other = VersionEnvironmentBlob.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

    @Property public void protoEquality(VersionEnvironmentDiff b) throws ModelDBException {
        VersionEnvironmentDiff newb = enforceOneof(b);
        VersionEnvironmentDiff other = VersionEnvironmentDiff.fromProto(newb.toProto().build());
        assertEquals(newb, other);
    }

}
