from matrix_client.client import MatrixClient
from matrix_client.crypto.olm_device import OlmDevice
import time

host = "https://ansuddin.xyz"
user_id = "@ans:ansuddin.xyz"
password = "test"
#device_id = "device_id"
room_id = "!fLhiSuTZAupSQpcEXs:ansuddin.xyz"

def on_message(room, event):
    if event['type'] == "m.room.member":
        if event['membership'] == "join":
            print("{0} joined".format(event['content']['displayname']))
    elif event['type'] == "m.room.message":
        if event['content']['msgtype'] == "m.text":
            print("{0}: {1}".format(event['sender'], event['content']['body']))
    else:
        print(event['type'])

#client = MatrixClient(host)
client = MatrixClient(host, encryption=True)

token = client.login_with_password(username="ans", password="test")

#rooms = client.get_rooms()

room = client.join_room(room_id)
#room.add_listener(on_message)
#client.start_listener_thread()
#room.send_text("test")

if not room.encrypted:
    room.send_text("Unencrypted!")
    room.enable_encryption()
    room.send_text("Encrypted, if we had the required power level.")

if room.encrypted:
	room.send_text("Success!")
#time.sleep(1)
#while True:
#        try:
#            get_input = raw_input
#        except NameError:
#            get_input = input
#        msg = get_input()
#        if msg == "/quit":
#            break
#        else:
#            room.send_text(msg)


