import spock.lang.Specification

class MathTest extends Specification {

    def "Default test suite test!" () {
        given:
        MathUtil mathUtil = new MathUtil()
        int num1 = 2
        int num2 = 4

        when:
        int result = mathUtil.add(num1, num2)

        then:
        assert result == num1 + num2
    }

}
