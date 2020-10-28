package com.controlefinanceiro.commons;

public interface ErrorResponse<T extends ErrorResponseDetail> extends Response {
    T getError();
}
