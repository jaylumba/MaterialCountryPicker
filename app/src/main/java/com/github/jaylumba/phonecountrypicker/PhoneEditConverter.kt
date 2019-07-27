package com.github.jaylumba.phonecountrypicker

import androidx.databinding.InverseMethod


object PhoneEditConverter {
    @InverseMethod("toNumber")
    @JvmStatic
    fun toString(
        view: PhoneNumberEditText,
        value: String?
    ): String? {
        return PhoneNumberEditText.fromTextNumber(view, value ?: "")
    }

    @JvmStatic
    fun toNumber(
        view: PhoneNumberEditText,
        value: String?
    ): String? {
        return PhoneNumberEditText.toTextNumber(view)
    }
}