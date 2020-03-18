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

public class CodeBlobGen extends Generator<CodeBlob> {
    public CodeBlobGen() {
        super(CodeBlob.class);
    }

    @Override public CodeBlob generate(
            SourceOfRandomness r,
            GenerationStatus status) {
                // if (r.nextBoolean())
                //     return null;

                CodeBlob obj = new CodeBlob();
                if (r.nextBoolean()) {
                    obj.setGit(Utils.removeEmpty(gen().type(GitCodeBlob.class).generate(r, status)));
                }
                if (r.nextBoolean()) {
                    obj.setNotebook(Utils.removeEmpty(gen().type(NotebookCodeBlob.class).generate(r, status)));
                }
                return obj;
    }
}
