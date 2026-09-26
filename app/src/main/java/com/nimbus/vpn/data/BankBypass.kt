package com.nimbus.vpn.data

object BankBypass {
    val packages: List<String> = listOf(
        "ru.sberbankmobile",
        "com.idamob.tinkoff.android",
        "ru.alfabank.mobile.android",
        "ru.vtb24.mobilebanking.android",
        "ru.gazprombank.android.mobilebank.app",
        "ru.raiffeisen.rmobile",
        "com.yandex.bank",
        "ru.rosbank.android",
        "ru.otpbank.mobile",
        "ru.sovcomcard.halva.v1",
        "ru.bspb.mobile",
        "ru.mts.bank",
        "com.google.android.apps.walletnfcrel",
    )

    fun matching(installed: Set<String>): List<String> = packages.filter { it in installed }
}
