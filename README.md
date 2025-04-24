@'
📘 README: Computer Networks P2P File Sharing Project

🧠 PROJECT DESCRIPTION
This project implements a BitTorrent-style Peer-to-Peer (P2P) file sharing system in Java. Each peer communicates using custom message types over TCP and follows a specified protocol to share pieces of a file among a network of peers.

Peers exchange:
- Handshake messages to verify identity
- Bitfield messages to communicate available pieces
- Interested/Not Interested to indicate download interest
- Choke/Unchoke messages every p seconds
- Optimistic unchoke every m seconds
- Request, Piece, and Have messages during file download

The system terminates when all peers have received the full file.

...

📎 SUBMISSION CHECKLIST
- [x] Java source code in /src
- [x] Config files in /config
- [x] Logs in /log
- [x] README + Video demo

🎥 VIDEO DEMO LINK:
[Insert your OneDrive or Canvas link here]
'@ | Out-File -Encoding UTF8 README.txt
