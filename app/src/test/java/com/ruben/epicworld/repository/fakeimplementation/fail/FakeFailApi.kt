package com.ruben.epicworld.repository.fakeimplementation.fail

import com.ruben.epicworld.remote.RemoteException
import com.ruben.epicworld.remote.model.request.GetAllGamesRequest
import com.ruben.epicworld.remote.model.response.GetAllGamesResponse
import com.ruben.epicworld.remote.rest.RestApi

/**
 * Created by Ruben Quadros on 01/08/21
 **/
class FakeFailApi: RestApi {
    override suspend fun getAllGames(getAllGamesRequest: GetAllGamesRequest): GetAllGamesResponse {
        throw RemoteException.GenericError("Api Error")
    }
}