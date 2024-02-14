package com.mahammadjafarzade.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Extra (

  var imageCount     : Int?    = null,
  var thumbnailImage : String? = null

) : Parcelable