package com.jhomlala.better_player

import com.google.android.exoplayer2.upstream.DataSpec
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
import java.net.URI

internal class CustomCacheKeyFactory : CacheKeyFactory {
    // Ignore the query and fragment part of the input url
    override fun buildCacheKey(dataSpec: DataSpec): String {
        return URI(
            dataSpec.uri.scheme,
            dataSpec.uri.authority,
            dataSpec.uri.path,
            null,
            null
        ).toString()
    }
}