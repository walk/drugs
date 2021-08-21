package me.brew.drugs.drug.data.impl.marijuana.strain

import me.brew.drugs.drug.data.impl.marijuana.MarijuanaStrain
import me.brew.drugs.drug.data.weight.DrugWeight
import org.bukkit.ChatColor

object GorillaGlue : MarijuanaStrain("gorilla-glue","${ChatColor.DARK_PURPLE}Gorilla Glue #4") {

    override fun getTHCPercentage(): Double {
        return 18.0
    }

    override fun getType(): MarijuanaType {
        return MarijuanaType.HYBRID
    }

    override fun getDescription(): MutableList<String> {
        return mutableListOf(
            "Gorilla Glue #4 is a mix between Sour Dubb, Chem Sis And Chocolate Diesel",
            "It is a hybrid, although it is indica dominant with 63% Indica and 37% Sativa."
        )
    }

    override fun getAmountToOverdose(): DrugWeight? {
        return null
    }

}