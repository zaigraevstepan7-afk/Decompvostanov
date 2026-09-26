package main

type feed struct {
	url           string
	label         string
	onlyWhitelist bool
}

var feeds = []feed{
	{url: "https://cdn-sub.file-racing.online/sub/lte/f9afd2d3-3858-403e-bbc9-9a720420c188", label: "LTE", onlyWhitelist: false},
	{url: "https://connliberty.com/connection/subs/dcf2b960-d490-40dd-a18b-1718550f939e", label: "\u0432\u0442\u043e\u0440\u0430\u044f", onlyWhitelist: true},
}
