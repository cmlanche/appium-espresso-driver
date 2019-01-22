/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appium.espressoserver.lib.model

import com.google.gson.annotations.SerializedName

class ScrollToPageParams : AppiumParams() {
    var scrollTo: ScrollTo? = null
    var scrollToPage: Int? = null
        private set
    var smoothScroll: Boolean? = null
        get() = if (field == null) false else field

    fun setScrollTo(scrollToPage: Int?) {
        this.scrollToPage = scrollToPage
    }


    enum class ScrollTo {
        @SerializedName("first")
        FIRST,
        @SerializedName("last")
        LAST,
        @SerializedName("left")
        LEFT,
        @SerializedName("right")
        RIGHT
    }
}
