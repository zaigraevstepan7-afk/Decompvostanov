package com.antigravity.core.api

data class GeminiModel(
    val id: String,
    val title: String,
    val description: String,
)

object GeminiModels {
    val ALL = listOf(
        GeminiModel("gemini-3-flash", "Gemini 3 Flash", "Быстрый агентный цикл, лимиты Antigravity"),
        GeminiModel("gemini-3.5-flash", "Gemini 3.5 Flash", "Flash текущего поколения через Antigravity"),
        GeminiModel("gemini-3-pro-low", "Gemini 3 Pro Low", "Pro, экономный thinking"),
        GeminiModel("gemini-3-pro-high", "Gemini 3 Pro High", "Pro, максимальный thinking"),
        GeminiModel("gemini-2.5-pro", "Gemini 2.5 Pro", "Стабильный Pro"),
        GeminiModel("gemini-2.5-flash", "Gemini 2.5 Flash", "Стабильный Flash"),
    )

    val DEFAULT = ALL.first().id

    fun ids(): List<String> = ALL.map { it.id }
}
