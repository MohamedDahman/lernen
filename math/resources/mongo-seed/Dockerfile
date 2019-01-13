FROM mongo

COPY init_words.json /init_words.json
CMD mongoimport --host mongodb --db LERNEN --collection dict --type json --file /init_words.json --jsonArray
