package com.example.beaglepoc.beagle.config

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.BeagleConfig
import br.com.zup.beagle.android.setup.Cache
import br.com.zup.beagle.android.setup.Environment

@BeagleComponent
class AppBeagleConfig : BeagleConfig {
    override val environment: Environment get() = Environment.DEBUG
    override val baseUrl: String get() = "http://192.168.1.10:8080/"
    override val isLoggingEnabled: Boolean = true
    override val cache: Cache = Cache(
        enabled = false,
        maxAge = 300,
        size = 15
    )
}