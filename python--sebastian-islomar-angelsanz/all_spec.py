from expects import expect, be_false, be_true, equal


with description('FizzBuzz'):
    with it('number 2 is not modified'):
        expect(transform_number(2)).to(equal('2'))

    with it('number 1 is not modified'):
        expect(transform_number(1)).to(equal('1'))

    with context('numbers divisible by 3 are modified to "Fizz"'):
        with it('number 3 is modified to "Fizz"'):
            expect(transform_number(3)).to(equal('Fizz'))

        with it('number 12 is modified to "Fizz"'):
            expect(transform_number(12)).to(equal('Fizz'))

    with context('numbers divisible by 5 are modified to "Buzz"'):
        with it('number 5 is modified to "Buzz'):
            expect(transform_number(5)).to(equal('Buzz'))

        with it('number 25 is modified to "Buzz'):
            expect(transform_number(25)).to(equal('Buzz'))


    with context('numbers divisible by 15 are modified to "FizzBuzz"'):
        with it('number 30'):
            expect(transform_number(30)).to(equal('FizzBuzz'))

        with it('number 60'):
            expect(transform_number(60)).to(equal('FizzBuzz'))


    with context('numbers divisible by 7 are modified to "Wizz"'):
        with it('number 7'):
            expect(transform_number(7)).to(equal('Wizz'))




rules = {3: 'Fizz', 5: 'Buzz', 7: 'Wizz'}



def is_divisible_by_15(number):
    return is_divisible_by_3(number) and is_divisible_by_5(number)

def is_divisible_by_3(number):
    return number % 3 == 0

def is_divisible_by_5(number):
    return number % 5 == 0




def transform_number(number):
    if is_divisible_by_15(number):
        return 'FizzBuzz'

    for rule in rules:
        if number % rule == 0:
            return rules[rule]

    return str(number)
