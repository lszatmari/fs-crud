FROM node:current-alpine

EXPOSE 3000

WORKDIR /usr/src/app/fscrud/

COPY ./../package.json package.json

RUN npm install

COPY . .

CMD ["npm", "start"]
