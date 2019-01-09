from matrix_client.client import MatrixClient

host = "https://ansuddin.xyz"
user_id = "@ans:ansuddin.xyz"
password = "test"
#device_id = "device_id"
room_id = "!fLhiSuTZAupSQpcEXs:ansuddin.xyz"


client = MatrixClient(host)
token = client.login_with_password(username="ans", password="test")
room = client.join_room(room_id)


room.backfill_previous_messages(True,1)

events = room.get_events()

for event in events:
    if event['type'] == "m.room.message":
        if event['content']['msgtype'] == "m.text":
            print("{0}".format(event['content']['body']))

