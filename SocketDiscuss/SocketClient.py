import socket
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
print "Socket OK"
port = 6969
s.connect(('192.168.175.128', port))
print s.recv(1024)
s.close()