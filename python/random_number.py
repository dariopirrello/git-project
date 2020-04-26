import random as rd

def generate_random_number(times,max_number):
    randomic_list = ""
    for time in range(times):
        randomic_list = f"{rd.randint(1 , max_number)}," + randomic_list
    return randomic_list

max_number = 10
times = 3
random_number = generate_random_number(times, max_number)

random_int_number = []

print("the random number is {}" .format(random_number.split(",")))

for number in random_number.split(","):
    if number != '':
        random_int_number.append(int(number))

print("the random number is {}" .format(random_int_number))
