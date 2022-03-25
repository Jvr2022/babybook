package com.serwylo.babybook

import android.content.Context
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import io.github.tonnyl.whatsnew.WhatsNew
import io.github.tonnyl.whatsnew.item.WhatsNewItem
import io.github.tonnyl.whatsnew.util.PresentationOption

object Changelog {

    @JvmStatic
    fun show(activity: AppCompatActivity) {

        val whatsNew = buildDialog(activity)
        whatsNew.presentationOption = PresentationOption.IF_NEEDED
        whatsNew.presentAutomatically(activity)

    }

    private fun buildDialog(context: Context): WhatsNew {

        return WhatsNew.newInstance(
            WhatsNewItem(
                "Multi-language Wikipedia",
                "Select from over 70 different Wikipedia sites from the settings. Once selected, all newly created books will fetch text and images from this Wiki. Currently supports all Wikipedia's with over 100,000 articles.",
                R.drawable.ic_language,
            ),
            WhatsNewItem(
                "Volume buttons change pages",
                "When reading a book, you can now press volume down to go to the next page, or up to go to the previous.",
                R.drawable.ic_book,
            ),
            WhatsNewItem(
                "Support Baby Book Development",
                Html.fromHtml("Baby Book is and always will be free and open source. If you are able, please <a href=\"https://github.com/babydots/babybook#support\">show your support and contribute to its further development</a>."),
                R.drawable.ic_heart
            ),
        ).apply {
            titleText = "What's New?"
            buttonText = "Continue"
        }

    }

}
