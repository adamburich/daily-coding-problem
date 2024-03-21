# This problem was asked by PayPal.

# Given a string and a number of lines k, print the string in zigzag form. In zigzag, characters are printed out diagonally from top left to bottom right until reaching the kth line, then back up to top right, and so on.

# For example, given the sentence "thisisazigzag" and k = 4, you should print:

# t     a     g
#  h   s z   a
#   i i   i z
#    s     g

def zigzag(str, k):
    lines_out = [" "*len(str)]*k
    ind = 0
    k_ind = 0
    delta = 1

    for c in str:
        line = list(lines_out[k_ind])
        line[ind] = c
        lines_out[k_ind] = line

        ind += 1
        k_ind += delta

        if(k_ind == 3):
            delta = -1
        elif(k_ind == 0):
            delta = 1

    for i in range(k):
        print(''.join(lines_out[i]))

zigzag("thisisazigzag", 4)
zigzag("hereisanotherzigzag", 5)