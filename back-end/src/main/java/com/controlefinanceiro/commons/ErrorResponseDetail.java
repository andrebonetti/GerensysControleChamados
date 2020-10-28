package com.controlefinanceiro.commons;

import java.util.List;

public class ErrorResponseDetail {

    private final int status;
    private final String error;
    private final String description;
    private final List<FieldError> fields;

    private ErrorResponseDetail(Builder builder) {
        status = builder.status;
        error = builder.error;
        description = builder.description;
        fields = builder.fields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getDescription() {
        return description;
    }

    public List<FieldError> getFields() {
        return fields;
    }

    public static final class Builder {
        private int status;
        private String error;
        private String description;
        private List<FieldError> fields;

        private Builder() {
        }

        public Builder withStatus(int status) {
            this.status = status;
            return this;
        }

        public Builder withError(String error) {
            this.error = error;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withFields(List<FieldError> fields) {
            this.fields = fields;
            return this;
        }

        public ErrorResponseDetail build() {
            return new ErrorResponseDetail(this);
        }
    }

}
