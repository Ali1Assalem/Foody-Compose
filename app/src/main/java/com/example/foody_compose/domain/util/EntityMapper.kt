package com.example.foody_compose.domain.util

interface EntityMapper <T , DomainModel> {

    fun mapToDomainModel(model: T) : DomainModel

    fun mapFromDomainModel(domainModel: DomainModel) : T

}