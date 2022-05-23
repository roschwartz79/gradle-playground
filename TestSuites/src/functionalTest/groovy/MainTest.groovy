import spock.lang.Specification

class MainTest extends Specification {

    def "functionalTest suite test!" () {
        given:
        MathUtil mathUtil = new MathUtil()
        int num1 = 5
        int num2 = 5

        when:
        int result = mathUtil.add(num1, num2)

        then:
        assert result == num1 + num2
    }
}
