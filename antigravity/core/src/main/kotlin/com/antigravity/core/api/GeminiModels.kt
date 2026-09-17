package com.antigravity.core.api

data class GeminiModel(
    val id: String,
    val title: String,
    val description: String,
)

object GeminiModels {
    val ALL = listOf(
        GeminiModel("gemini-3.8-flash-high", "Gemini 3.8 Flash", "Новейший Flash, квоты Antigravity"),
        GeminiModel("gemini-3.7-flash-high", "Gemini 3.7 Flash", "Flash 3.7 High"),
        GeminiModel("gemini-3.6-flash-high", "Gemini 3.6 Flash", "Flash 3.6 High"),
        GeminiModel("gemini-3.5-flash-lite", "Gemini 3.5 Flash Lite", "Лёгкий 3.5"),
        GeminiModel("gemini-3.5-flash-low", "Gemini 3.5 Flash Low", "3.5 thinking low"),
        GeminiModel("gemini-3-flash-agent", "Gemini 3.5 Flash High", "Агентный 3.5 (внутренний id)"),
        GeminiModel("gemini-pro-agent", "Gemini 3.1 Pro High", "Pro 3.1, высокий thinking"),
        GeminiModel("gemini-3.1-pro-low", "Gemini 3.1 Pro Low", "Pro 3.1, экономный thinking"),
        GeminiModel("gemini-3.1-flash-lite", "Gemini 3.1 Flash Lite", "Быстрый 3.1 Lite"),
        GeminiModel("gemini-3.5-flash", "Gemini 3.5 Flash", "Каноническое имя 3.5"),
        GeminiModel("gemini-3-pro-high", "Gemini 3 Pro High", "Pro 3 High"),
        GeminiModel("gemini-3-pro-low", "Gemini 3 Pro Low", "Pro 3 Low"),
        GeminiModel("gemini-3-flash", "Gemini 3 Flash (старая)", "Часто упирается в лимит 429"),
        GeminiModel("gemini-2.5-pro", "Gemini 2.5 Pro", "Стабильный Pro"),
        GeminiModel("gemini-2.5-flash", "Gemini 2.5 Flash", "Стабильный Flash"),
        GeminiModel("claude-sonnet-4-6", "Claude Sonnet 4.6", "Через квоты Antigravity"),
        GeminiModel("claude-opus-4-6-thinking", "Claude Opus 4.6 Thinking", "Через квоты Antigravity"),
        GeminiModel("gpt-oss-120b-medium", "GPT-OSS 120B", "Через квоты Antigravity"),
    )

    val DEFAULT = "gemini-3.8-flash-high"

    fun titleOf(id: String): String = ALL.firstOrNull { it.id == id }?.title ?: id

    fun ids(): List<String> = ALL.map { it.id }
}
