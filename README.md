# Server Motd Plugin

### Configuration
```
Server-MOTD:
  Line-1: "&8» &8&m-[&r&c&l Server &8&m] &8● &7Your server motd"
  Line-2: "&8» &cGithub &8● &7@yasbtw &7Enjoy your Motd"

# The motd of the player when they join in.
Join-Message:
  Enabled: true
  Messages:
    - '&eWelcome to the server.'

# Server icon.
Custom-Server-Icon:
  # Set to true will load image from motd folder.
  Enabled: false
  # Make sure it's 64 x 64 pixels with png format.
  Image: server-icon.png

# The maximum players of the server.
Server-Maximum-Players:
  Modify: true
  Maximum-Players: 200
```

### Commands
**/motd <reload>**