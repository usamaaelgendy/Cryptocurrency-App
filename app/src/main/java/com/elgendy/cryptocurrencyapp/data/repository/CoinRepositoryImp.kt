package com.elgendy.cryptocurrencyapp.data.repository

import com.elgendy.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.elgendy.cryptocurrencyapp.data.remote.dto.CoinDetailsDto
import com.elgendy.cryptocurrencyapp.data.remote.dto.CoinDto
import com.elgendy.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImp @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins();
    }

    override suspend fun getCoinDetails(coinId: String): CoinDetailsDto {
        return api.getCoinById(coinId)
    }
}