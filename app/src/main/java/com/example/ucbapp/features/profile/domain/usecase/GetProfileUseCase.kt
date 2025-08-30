package com.example.ucbapp.features.profile.domain.usecase

import com.example.ucbapp.features.profile.domain.model.ProfileModel
import com.example.ucbapp.features.profile.domain.repository.IProfileRepository

class GetProfileUseCase (
    val repository: IProfileRepository
) {
    suspend fun invoke(): Result<ProfileModel> {
        return repository.fetchData()
    }
}