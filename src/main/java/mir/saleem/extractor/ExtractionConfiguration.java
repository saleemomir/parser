package mir.saleem.extractor;

import java.util.*;

public class ExtractionConfiguration {
    private String documentType;
    private List<PageHandler> pageHandlers = new ArrayList<>();

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExtractionConfiguration)) return false;
        ExtractionConfiguration that = (ExtractionConfiguration) o;
        return Objects.equals(getDocumentType(), that.getDocumentType()) && Objects.equals(pageHandlers, that.pageHandlers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDocumentType(), pageHandlers);
    }
}

class PageHandler {
    private String pageNumbersApplied;
    private List<ExtractorConfiguration> extractors = new ArrayList<>();;

    public String getPageNumbersApplied() {
        return pageNumbersApplied;
    }

    public void setPageNumbersApplied(String pageNumbersApplied) {
        this.pageNumbersApplied = pageNumbersApplied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PageHandler)) return false;
        PageHandler that = (PageHandler) o;
        return Objects.equals(getPageNumbersApplied(), that.getPageNumbersApplied()) && Objects.equals(extractors, that.extractors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPageNumbersApplied(), extractors);
    }
}

class ExtractorConfiguration {
    private TypeAndParametersConfiguration detector;
    private TypeAndParametersConfiguration processor;

    public TypeAndParametersConfiguration getDetector() {
        return detector;
    }

    public void setDetector(TypeAndParametersConfiguration detector) {
        this.detector = detector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExtractorConfiguration)) return false;
        ExtractorConfiguration that = (ExtractorConfiguration) o;
        return Objects.equals(getDetector(), that.getDetector()) && Objects.equals(processor, that.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDetector(), processor);
    }
}

class TypeAndParametersConfiguration {
    private String type;
    private Map<String, String> parameters = new HashMap<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TypeAndParametersConfiguration)) return false;
        TypeAndParametersConfiguration that = (TypeAndParametersConfiguration) o;
        return Objects.equals(getType(), that.getType()) && Objects.equals(parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), parameters);
    }
}
