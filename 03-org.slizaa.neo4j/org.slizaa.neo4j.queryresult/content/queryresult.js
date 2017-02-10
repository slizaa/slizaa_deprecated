function renderQueryResult(queryResult) {

    // handle error json ({ "message": "a msg", "exception": "an exception"})
    if (typeof queryResult['message'] !== 'undefined' && typeof queryResult['exception'] !== 'undefined') {
        $("#error").text("Error: " + queryResult['message']);
        return;
    }

    // create the table header
    $.each(queryResult.results[0].columns, function (i, val) {
        $("#query-result-table-header").append('<td class="query-result-table-header">' + val + '</td>');
    });

    // create the body values
    $.each(queryResult.results[0].data, function (i, val) {
        var $tr = $('<tr></tr>');
        var row_values = val.row;
        $("#tbody").append($tr);
        $.each(row_values, function (i, val) {
            $tr.append('<td class="data">' + renderContent(val) + '</td>');
        });
    });
}

/**
 *
 * @param row_value
 * @returns {*}
 */
function renderContent(row_value) {

    switch (row_value.constructor) {

        case String:
            return row_value;
            break;
        case Number:
            return row_value;
            break;
        case Object:
            return renderObject(row_value);
            break;
        case Array:
            if (containsObjectsOrArrays(row_value)) {
                var html = '';
                for (var element in row_value) {
                    html += renderObject(row_value[element]);
                    console.log(element + " : " + row_value.length)
                    if (element < (row_value.length - 1)) {
                        html += ',';
                    }
                }
                return html;
            } else {
                return '[' + row_value + ']';
            }
            break;
        default:
            return row_value;
            break;
    }
}

/**
 *
 *
 * @param node
 * @returns {string}
 */
function renderObject(node) {

    // create the table
    var html = '<table class="node"><tbody class="node_tbody">';

//     // add the node identifier
//     html += '<tr class="node_row node_id"><td class="node_id" colspan="2">' + node['id'] + '</td></tr>';
//
//     // add the node label
//     if (typeof node['labels'] !== 'undefined') {
//         html += '<tr class="node_row node_labels"><td class="node_labels" colspan="2"> [' + node['labels'] + '] </td></tr>';
//     } else if (typeof node['type'] !== 'undefined')
//     {
//         html += '<tr class="node_row node_labels"><td class="node_labels" colspan="2"> [' + node['type'] + '] </td></tr>';
//     }

    // add the node properties
    if (Object.keys(node).length === 0) {
        html += '<tr class="node_row">';
        html += '<td class="node_data_empty"> (empty) </td>';
        html += "</tr>";
    } else {
        for (var property in  node) {
            html += '<tr class="node_row">';
            html += '<td class="node_data">' + property + '</td>';
            html += '<td class="node_data">' + node[property] + '</td>';
            html += "</tr>";
        }
    }

    // close the table
    html += '</tbody></table>';

    // return the result
    return html;
}

function containsObjectsOrArrays(array) {
    for (var element in array) {
        switch (array[element].constructor) {

            case Object:
                return true;
                break;
            case Array:
                return true;
                break;
            default:
                break;
        }
    }
    return false;
}