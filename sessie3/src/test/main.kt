package test

fun main(){

    val comm = SoftSkills(
        "Communication II",
        "Je leert professioneel communiceren in het Engels, zowel schriftelijk als mondeling.",
        "1"
    )
    val grow = SoftSkills(
        "Grow III",
        "Je werkt een project uit dat kadert in één van de vijf opgelegde domeinen, formuleert persoonlijke doelstellingen, reflecteert over je eigen attitude (scoring bij start en einde van het project) en brengt alle onderdelen samen in een portfolio",
        "2"
    )

    comm.displayCourse()
    grow.displayCourse()

}