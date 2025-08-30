package com.example.ucbapp.features.profile.domain.repository

import com.example.ucbapp.features.profile.domain.model.ProfileModel

interface IProfileRepository {
    fun fetchData(): Result<ProfileModel>
}