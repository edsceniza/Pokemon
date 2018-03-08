package edna.ceniza.com.pokemon

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Edna Ceniza on 07/03/2018.
 */
data class Pokemon ( val poke_name: String,
                     val poke_img: Sprites,
                     val poke_id: Int
)

data class Sprites(
        val front_default: String
)

