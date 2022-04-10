package com.example.error;

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.response.ErrorContext;
import io.micronaut.http.server.exceptions.response.ErrorResponseProcessor;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Produces
@Singleton
@Requires(classes = { InstitutionNotFoundException.class})
@RequiredArgsConstructor
public class ExceptionHandler implements io.micronaut.http.server.exceptions.ExceptionHandler<InstitutionNotFoundException, HttpResponse<?>> {

    @Override
    public HttpResponse<?> handle(HttpRequest request, InstitutionNotFoundException exception) {
//        LOG.error(exception.getLocalizedMessage());
//        LOG.error(exception.getCause().getMessage());
//        Arrays.stream(exception.getStackTrace()).forEach(item ->  LOG.error(item.toString()));
        Error error = new Error(exception.getLocalizedMessage(), exception.getStatus().getCode());
        return HttpResponse.status(exception.getStatus()).body(error);
    }



}
