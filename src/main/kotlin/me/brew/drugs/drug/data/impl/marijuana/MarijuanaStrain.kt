package me.brew.drugs.drug.data.impl.marijuana

import me.brew.drugs.drug.data.Drug
import me.brew.drugs.drug.data.classification.DrugClassification
import me.brew.drugs.drug.data.weight.DrugWeight

abstract class MarijuanaStrain(val id: String,val name: String) : Drug(DrugType.MARIJUANA) {

    abstract fun getTHCPercentage(): Double

    abstract fun getType(): MarijuanaType

    abstract fun getDescription(): MutableList<String>

    override fun getDrugId(): String {
        return this.id
    }

    override fun getDrugName(): String {
        return this.name
    }

    override fun getClassification(): DrugClassification {
        return DrugClassification.CANNABINOID
    }

    override fun getAmountToOverdose(): DrugWeight? {
        return null
    }

    enum class MarijuanaType {

        INDICA,
        SATIVA,
        HYBRID

    }

}