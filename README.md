# FirestoreTutorial
Explore more about Cloud Firestore

# Summary

1. Added local data will automatically sync to Server if Device has connection
2. If Device has no connection, added local data will persist on local, until there is connection
3. If Device has no connection, getting data will get from local
4. **Clear Cache** won't delete Local Data
5. **Clear Data** will delete Local Data
6. **Adding data in offline mode + apps in background** = Data will be sync to Server if **there is connection**
7. **Adding data in offline mode + apps killed** = Data will be sync to Server when **user Add a new data**
