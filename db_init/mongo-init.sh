set -e

mongo <<EOF
db = db.getSiblingDB('sharecode')

db.createUser({
  user: 'mongo_admin',
  pwd: 'mongo',
  roles: [ { role: "userAdminAnyDatabase", db: "admin" } ]
});
