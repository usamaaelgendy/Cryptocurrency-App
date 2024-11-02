package com.elgendy.cryptocurrencyapp.domain.repository

import com.elgendy.cryptocurrencyapp.data.remote.dto.CoinDetailsDto
import com.elgendy.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinDetails(coinId: String): CoinDetailsDto
}