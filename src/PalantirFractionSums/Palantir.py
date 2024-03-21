# This problem was asked by Palantir.

# The ancient Egyptians used to express fractions as a sum of several terms where each numerator is one. 
# For example, 4 / 13 can be represented as 1 / 4 + 1 / 18 + 1 / 468.

# Create an algorithm to turn an ordinary fraction a / b, where a < b, into an Egyptian fraction.

def egyptian_fractions(numerator, denominator):
    if numerator == 1:
        return [denominator]
    else:
        d = denominator // numerator
        r = denominator % numerator
        if r == 0:
            return [d]
        else:
            d += 1
            return [d] + egyptian_fractions(numerator*d-denominator, denominator*d)
        
print(egyptian_fractions(4, 13))