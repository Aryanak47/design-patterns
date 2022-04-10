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

@Produces
@Singleton
@Requires(classes = { InstitutionNotFoundException.class})
@RequiredArgsConstructor
public class ExceptionHandler implements io.micronaut.http.server.exceptions.ExceptionHandler<InstitutionNotFoundException, HttpResponse<?>> {

    @Override
    public HttpResponse<?> handle(HttpRequest request, InstitutionNotFoundException exception) {
        HttpStatus status = exception.getStatus();
        if(status == HttpStatus.BAD_REQUEST){
            return HttpResponse.badRequest(exception.getLocalizedMessage());
        }
        return  HttpResponse.serverError(exception.getLocalizedMessage());

    }
}
