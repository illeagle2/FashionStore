/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cyberwalker.fashionstore.data.di

import com.cyberwalker.fashionstore.data.HomeRepository
import com.cyberwalker.fashionstore.data.source.HomeRemoteSource
import com.cyberwalker.fashionstore.login.AccountService
import com.cyberwalker.fashionstore.login.AccountServiceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object Di {

    fun getHomeRemoteSource() = HomeRemoteSource()

    fun getHomeRepository(source: HomeRemoteSource) = HomeRepository(source)
}

//@Module
//@InstallIn(ViewModelComponent::class)
//abstract class ServiceModule {
//
//    @Binds
//    abstract fun provideAccountService(impl: AccountServiceImpl) : AccountService
//}