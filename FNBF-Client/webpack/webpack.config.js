const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const { ContextReplacementPlugin } = require('webpack');

module.exports = {
    entry: {
        main: './src/main.ts'
    },
    output: {
        path: path.join(__dirname, "./dist/"),
        filename: "[name].bundle.js",
    },
    watch:true,
    resolve: {
        extensions: [' ','.js', '.ts','.json','.css', '.html']
    },
    devServer: {
        contentBase: path.join(__dirname, "../dist/"),
        port: 7080
    },
    devtool: 'inline-source-map',
    module: {
        loaders: [
            { test: /.ts$/, use: ['awesome-typescript-loader', 'angular2-template-loader'] },
            { test: /.html$/, use: 'raw-loader' },
            { test: /\.css$/, loaders: ['to-string-loader', 'css-loader']},
            { test: /\.json$/, use: ["json-loader"]}
        ]
    },
    plugins: [
        new HtmlWebpackPlugin({
            template: "./src/index.html",
            filename: "index.html",
            showErrors: true,
            title: "Webpack App",
            path: path.join(__dirname, "../dist/"),
            hash: true
        }),
        new ContextReplacementPlugin(
            /angular(\\|\/)core(\\|\/)@angular/,
            path.resolve(__dirname, '../src')
        )
    ]
    
}
