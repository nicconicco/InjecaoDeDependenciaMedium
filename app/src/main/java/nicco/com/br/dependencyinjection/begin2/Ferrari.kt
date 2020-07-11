package nicco.com.br.dependencyinjection.begin2

class Ferrari : Engine {
    override fun getModel(): String {
        return "Meu modelo é uma Ferrari"
    }
}

class Mercedes : Engine {
    override fun getModel(): String {
        return "Meu modelo é uma Mercedes"
    }
}