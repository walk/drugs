package me.brew.drugs.drug.data

import me.brew.drugs.drug.data.classification.DrugClassification
import me.brew.drugs.drug.data.weight.DrugWeight

/**
 * @author brew@atheist.com
 *
 * @date 8/20/2021
 * @project drugs
 */
abstract class Drug(val type: DrugType) {

    open fun getDrugId(): String {
        return this.type.name.lowercase()
    }

    open fun getDrugName(): String {
        return this.type.id
    }

    abstract fun getClassification(): DrugClassification

    abstract fun getAmountToOverdose(): DrugWeight?

    enum class DrugType(val id: String) {

        MARIJUANA("Marijuana"),
        COCAINE("Cocaine")

    }

}