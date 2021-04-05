// https://www.hackerrank.com/challenges/attribute-parser/problem
#include <iostream>
#include <map>
#include <sstream>
using namespace std;

int main() {
    string fullTag, values;
    getline(cin, values);
    stringstream sValues(values);
    int n, q;
    sValues >> n >> q;
    map<string, map<string, string>> tagMap;
    for (int i = 0; i < n; i++) {
        string tag, attr, val, equalBin, line;
        getline(cin, line);
        stringstream sLine(line);

        sLine >> tag;
        tag.erase(0, 1);
        map<string, string> attrMap;

        if (tag[0] != '/') {
            if (tag.back() == '>') tag = tag.substr(0, tag.size() - 1);
            if (fullTag.empty()) fullTag = tag;
            else fullTag += "." + tag;

            while(sLine >> attr) {
                sLine >> equalBin >> val;
                int valS = val.size();
                if (val[valS - 1] == '>') val = val.substr(0, val.size() - 1);
                attrMap.insert(
                        pair<string, string>(
                                attr, val.substr(1, val.size() - 2)
                        )
                );
            }
            tagMap.insert(pair<string, map<string, string>> (fullTag, attrMap));
        }
        else {
            int thisSize = tag.size() - 1;
            int fullSize = fullTag.size();
            if (thisSize < fullSize) fullTag.erase(fullSize - thisSize, thisSize);
            else fullTag = "";
        }
    }

    for (int i = 0; i < q; i++) {
        string query, tag, attr;
        cin >> query;
        int querySize = query.size();
        int breaker;
        for (int j = 0; j < querySize; j++) {
            if (query[j] == '~') {
                breaker = j;
                break;
            }
        }
        tag = query.substr(0, breaker);
        attr = query.substr(breaker + 1, querySize - breaker - 1);
        if (tagMap.find(tag) != tagMap.end()) {
            if (tagMap[tag].find(attr) != tagMap[tag].end())
                cout << tagMap[tag][attr] << endl;
            else cout << "Not Found!" << endl;
        }
        else cout << "Not Found!" << endl;
    }
    return 0;
}
