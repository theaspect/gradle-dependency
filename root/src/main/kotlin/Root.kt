fun main() {
    // We're in root

    // api project(":b:api")
    // implementation project(":b:imp")
    A().hello()

    // api project(":c:api")
    // implementation project(":c:imp")
    BApi().hello()

    // api project(":d:api")
    // implementation project(":d:imp")
    // BImp().hello() // Not visible

    // imp a > api b > api c
    CApi().hello()
    // imp a > api b > imp c
    // CImp().hello() // Not visible

    // imp a > imp b > api d
    // DApi().hello() // Not visible
    // imp a > imp b > imp d
    // DImp().hello() // Not visible

    // Inheritance
    EF().hello()

    // Optional param
    EG().hello()

    // Return value even ignored still have to be imported
    EH().hello()

    // No dependency needed if method not called
    EI().hello()

    // No dependencies for thrown exceptions
    EJ().hello()

    // No dependency needed if method called internally
    EK().hello()
}
