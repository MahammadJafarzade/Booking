package com.mahammadjafarzade.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HotelResponse (

  var responseCode    : Int?             = null,
  var errors          : String?          = null,
  var message         : String?          = null,
  var result          : Result?          = Result(),
  var campaignBanners : CampaignBanners? = CampaignBanners()

) : Parcelable
@Parcelize
data class User(var name: String):Parcelable

