aa = input().split()

a = aa[0]
b = aa[1]
c = aa[2]

print((int(a) + int(b))%int(c))
print((int(a)%int(c) + int(b)%int(c))%int(c))
print((int(a) * int(b))%int(c))
print((int(a)%int(c) * int(b)%int(c))%int(c))

